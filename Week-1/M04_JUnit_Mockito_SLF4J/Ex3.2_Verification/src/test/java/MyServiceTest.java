import static org.mockito.Mockito.*;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.process();

        verify(mockApi).sendData("Hello");
    }
}