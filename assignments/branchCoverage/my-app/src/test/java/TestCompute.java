import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void sizeKontrol() {
    MessageQueue mq = mock(MessageQueue.class);
	  when(mq.size()).thenReturn(0);
    c = new Compute(mq);
	int a =  c.countNumberOfOccurrences("hava guzel");
    assertTrue(a==-1);
  }
	
  @Test
  public void containsKomtrol() {
    MessageQueue mq = mock(MessageQueue.class);
	  when(mq.size()).thenReturn(2);
	   when(mq.contains(anyString())).thenReturn(false);
    c = new Compute(mq);
	int a =  c.countNumberOfOccurrences("hava guzel");
    assertTrue(a==0);
  }
	
  @Test
  public void counterKomtrol() {
    MessageQueue mq = mock(MessageQueue.class);
	  when(mq.size()).thenReturn(2);
	   when(mq.contains(anyString())).thenReturn(true);
    c = new Compute(mq);
	  when(mq.getAt(anyInt())).thenReturn("hava guzel");
	int a =  c.countNumberOfOccurrences("hava guzel");
    assertTrue(a==2);
  }
	 @Test
  public void counterKomtrol2() {
    MessageQueue mq = mock(MessageQueue.class);
	  when(mq.size()).thenReturn(2);
	   when(mq.contains(anyString())).thenReturn(true);
    c = new Compute(mq);
	  when(mq.getAt(anyInt())).thenReturn("abc");
	int a =  c.countNumberOfOccurrences("hava guzel");
    assertFalse(a==2);
  }
	
}