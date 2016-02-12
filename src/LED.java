import com.logitech.gaming.LogiLED;

public class LED{
    public static void init(){
        int time = 100;

        LogiLED led = new LogiLED();


        //int[][] multi = new int[5][20];
        int[][] positionMap = new int[][]{
                {0x01, 0x3b, 0x3c, 0x3d, 0x3e, 0x3f, 0x40, 0x41, 0x42, 0x43, 0x44, 0x57,  0x58, 0x137, 0x46, 0x145},
                {0x29, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C,  0x0D, 0x0E, 0x152, 0x147, 0x149, 0x45, 0x135, 0x37, 0x4A},
                {0x0F, 0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1A, 0x1B, 0x2B, 0x153, 0x14F, 0x151, 0x47, 0x48, 0x49, 0x4E, 1000},
                {0x3A, 0x1E, 0x1F, 0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x1C, 0x4B, 0x4C, 0x4D, 0x4E, 1000},
                {0x2A, 0x2C, 0x2D, 0x2E, 0x2F, 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x148, 0x4F, 0x50, 0x51, 0x11C, 1000},
                {0x1D, 0x15B, 0x38, 0x39, 0x138, 0x15C, 0x15D, 0x11D, 0x14B, 0x150, 0x14D, 0x52, 0x53, 0x11C, 1000},
        };


        while(true) {

            led.LogiLedInit();
            for (int i = 0; i < 16; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {

                }
                led.LogiLedSetLightingForKeyWithKeyName(positionMap[0][i], 100, 100, 100);
                System.out.println("Lighting Grid: Row 0 in Column: " + i + " Key: " + positionMap[0][i]);


            }
            for (int i = 0; i < 21; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {

                }

                led.LogiLedSetLightingForKeyWithKeyName(positionMap[1][i], 100, 0, 0);
                System.out.println("Lighting Grid: Row 1 in Column: " + i + " Key: " + positionMap[1][i]);


            }
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {

                }

                led.LogiLedSetLightingForKeyWithKeyName(positionMap[2][i], 0, 100, 0);
                System.out.println("Lighting Grid: Row 2 in Column: " + i + " Key: " + positionMap[1][i]);


            }
            for (int i = 0; i < 18; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {

                }

                led.LogiLedSetLightingForKeyWithKeyName(positionMap[3][i], 0, 0, 100);
                System.out.println("Lighting Grid: Row 3 in Column: " + i + " Key: " + positionMap[1][i]);


            }
            for (int i = 0; i < 18; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {

                }

                led.LogiLedSetLightingForKeyWithKeyName(positionMap[4][i], 100, 100, 100);
                System.out.println("Lighting Grid: Row 4 in Column: " + i + " Key: " + positionMap[1][i]);


            }
            for (int i = 0; i < 14; i++) {
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {

                }

                led.LogiLedSetLightingForKeyWithKeyName(positionMap[5][i], 100, 50, 50);
                System.out.println("Lighting Grid: Row 5 in Column: " + i + " Key: " + positionMap[1][i]);


            }

            try{
                led.LogiLedShutdown();
                Thread.sleep(5000);

            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted");
            }




        }

    }




    public static void main(String[] args) {
        init();

    }
}
