import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.LocalDevice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		try {
			LocalDevice device = LocalDevice.getLocalDevice();
		} catch (BluetoothStateException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: getlocalDevice()");
			e.printStackTrace();
		}
	}

}
