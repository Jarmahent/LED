import com.logitech.gaming.LogiLED;
import de.ksquared.system.keyboard.GlobalKeyListener;
import de.ksquared.system.keyboard.KeyAdapter;
import de.ksquared.system.keyboard.KeyEvent;
import java.lang.Math;



public class keyPressedLed implements Runnable {

    private Thread t;

    public void run() {
            int r = 100;
            int g = 0;
            int b = 0;
            int d = 500;
            int i = 100;


            LogiLED led = new LogiLED();
            led.LogiLedShutdown();
            led.LogiLedInit();
            new GlobalKeyListener().addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent event) {

                    switch (event.getVirtualKeyCode()) {

                        case 65:
                            //led.LogiLedSetLightingForKeyWithKeyName(0x1E, r, g, b);
                            led.LogiLedPulseSingleKey(0x1E, r, g, b, 0, 100, 0, d, false);//a
                            break;
                        case 66:
                            //led.LogiLedSetLightingForKeyWithKeyName(0x30, r, g, b);
                            led.LogiLedPulseSingleKey(0x30, r, g, b, 0, 100, 0, d, false);//b

                            break;
                        case 67:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x2E, r, g, b);
                            led.LogiLedPulseSingleKey(0x2E, r, g, b, 0, 100, 0, d, false);//c

                            break;
                        case 68:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x20, r, g, b);
                            led.LogiLedPulseSingleKey(0x20, r, g, b, 0, 100, 0, d, false);//d
                            break;
                        case 69:
                         //   led.LogiLedSetLightingForKeyWithKeyName(0x12, r, g, b);
                            led.LogiLedPulseSingleKey(0x12, r, g, b, 0, 100, 0, d, false);//e
                            break;
                        case 70:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x21, r, g, b);
                            led.LogiLedPulseSingleKey(0x21, r, g, b, 0, 100, 0, d, false);// f
                            break;
                        case 71:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x22, r, g, b);
                            led.LogiLedPulseSingleKey(0x22, r, g, b, 0, 100, 0, d, false);// g
                            break;
                        case 72:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x23, r, g, b);
                            led.LogiLedPulseSingleKey(0x23, r, g, b, 0, 100, 0, d, false);// h
                            break;
                        case 73:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x17, r, g, b);
                            led.LogiLedPulseSingleKey(0x17, r, g, b, 0, 100, 0, d, false);// i
                            break;
                        case 74:
                          //z  led.LogiLedSetLightingForKeyWithKeyName(0x24, r, g, b);
                            led.LogiLedPulseSingleKey(0x24, r, g, b, 0, 100, 0, d, false);// j
                            break;
                        case 75:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x25, r, g, b);
                            led.LogiLedPulseSingleKey(0x25, r, g, b, 0, 100, 0, d, false);// k
                            break;
                        case 76:
                            //led.LogiLedSetLightingForKeyWithKeyName(0x26, r, g, b);
                            led.LogiLedPulseSingleKey(0x26, r, g, b, 0, 100, 0, d, false);// l
                            break;
                        case 77:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x32, r, g, b);
                            led.LogiLedPulseSingleKey(0x32, r, g, b, 0, 100, 0, d, false);// m
                            break;
                        case 78:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x31, r, g, b);
                            led.LogiLedPulseSingleKey(0x31, r, g, b, 0, 100, 0, d, false);// n
                            break;
                        case 79:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x18, r, g, b);
                            led.LogiLedPulseSingleKey(0x18, r, g, b, 0, 100, 0, d, false);// o
                            break;
                        case 80:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x19, r, g, b);
                            led.LogiLedPulseSingleKey(0x19, r, g, b, 0, 100, 0, d, false);// p
                            break;
                        case 81:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x10, r, g, b);
                            led.LogiLedPulseSingleKey(0x10, r, g, b, 0, 100, 0, d, false);// q
                            break;
                        case 82:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x13, r, g, b);
                            led.LogiLedPulseSingleKey(0x13, r, g, b, 0, 100, 0, d, false);// r
                            break;
                        case 83:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x1F, r, g, b);
                            led.LogiLedPulseSingleKey(0x1F, r, g, b, 0, 100, 0, d, false);// s
                            break;
                        case 84:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x14, r, g, b);
                            led.LogiLedPulseSingleKey(0x14, r, g, b, 0, 100, 0, d, false);// t
                            break;
                        case 85:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x16, r, g, b);
                            led.LogiLedPulseSingleKey(0x16, r, g, b, 0, 100, 0, d, false);// u
                            break;
                        case 86:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x2F, r, g, b);
                            led.LogiLedPulseSingleKey(0x2F, r, g, b, 0, 100, 0, d, false);// v
                            break;
                        case 87:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x11, r, g, b);
                            led.LogiLedPulseSingleKey(0x11, r, g, b, 0, 100, 0, d, false);//w
                            break;
                        case 88:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x2D, r, g, b);
                            led.LogiLedPulseSingleKey(0x2D, r, g, b, 0, 100, 0, d, false);// x
                            break;
                        case 89:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x15, r, g, b);
                            led.LogiLedPulseSingleKey(0x15, r, g, b, 0, 100, 0, d, false);//y
                            break;
                        case 90:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x2C, r, g, b);
                            led.LogiLedPulseSingleKey(0x2C, r, g, b, 0, 100, 0, d, false);// z
                            break;


                        case 48:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x0B, r, g, b);
                            led.LogiLedPulseSingleKey(0x0B, r, g, b, 0, 100, 0, d, false);//0
                            break;
                        case 49:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x02, r, g, b);
                            led.LogiLedPulseSingleKey(0x02, r, g, b, 0, 100, 0, d, false);//1
                            break;
                        case 50:
                         //   led.LogiLedSetLightingForKeyWithKeyName(0x03, r, g, b);
                            led.LogiLedPulseSingleKey(0x03, r, g, b, 0, 100, 0, d, false);//2
                            break;
                        case 51:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x04, r, g, b);
                            led.LogiLedPulseSingleKey(0x04, r, g, b, 0, 100, 0, d, false);//3
                            break;
                        case 52:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x05, r, g, b);
                            led.LogiLedPulseSingleKey(0x05, r, g, b, 0, 100, 0, d, false);//4
                            break;
                        case 53:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x06, r, g, b);
                            led.LogiLedPulseSingleKey(0x06, r, g, b, 0, 100, 0, d, false);//5
                            break;
                        case 54:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x07, r, g, b);
                            led.LogiLedPulseSingleKey(0x07, r, g, b, 0, 100, 0, d, false);//6
                            break;
                        case 55:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x08, r, g, b);
                            led.LogiLedPulseSingleKey(0x08, r, g, b, 0, 100, 0, d, false);//7
                            break;
                        case 56:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x09, r, g, b);
                            led.LogiLedPulseSingleKey(0x09, r, g, b, 0, 100, 0, d, false);//8
                            break;
                        case 57:
                         //   led.LogiLedSetLightingForKeyWithKeyName(0x0A, r, g, b);
                            led.LogiLedPulseSingleKey(0x0A, r, g, b, 0, 100, 0, d, false);//9
                            break;

                        case 27:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x01, r, g, b);
                            led.LogiLedPulseSingleKey(0x01, r, g, b, 0, 100, 0, d, false);//esc
                            break;
                        case 112:
                         //   led.LogiLedSetLightingForKeyWithKeyName(0x3b, r, g, b);
                            led.LogiLedPulseSingleKey(0x3b, r, g, b, 0, 100, 0, d, false);//f1
                            break;
                        case 113:
                          // led.LogiLedSetLightingForKeyWithKeyName(0x3c, r, g, b);
                            led.LogiLedPulseSingleKey(0x3c, r, g, b, 0, 100, 0, d, false);//f2
                            break;
                        case 114:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x3d, r, g, b);
                            led.LogiLedPulseSingleKey(0x3d, r, g, b, 0, 100, 0, d, false);//f3
                            break;
                        case 115:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x3e, r, g, b);
                            led.LogiLedPulseSingleKey(0x3e, r, g, b, 0, 100, 0, d, false);//f4
                            break;
                        case 116:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x3f, r, g, b);
                            led.LogiLedPulseSingleKey(0x3f, r, g, b, 0, 100, 0, d, false);//f5
                            break;
                        case 117:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x40, r, g, b);
                            led.LogiLedPulseSingleKey(0x40, r, g, b, 0, 100, 0, d, false);//f6
                            break;
                        case 118:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x41, r, g, b);
                            led.LogiLedPulseSingleKey(0x41, r, g, b, 0, 100, 0, d, false);//f7
                            break;
                        case 119:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x42, r, g, b);
                            led.LogiLedPulseSingleKey(0x42, r, g, b, 0, 100, 0, d, false);//f8
                            break;
                        case 120:
                          //  led.LogiLedSetLightingForKeyWithKeyName(0x43, r, g, b);
                            led.LogiLedPulseSingleKey(0x43, r, g, b, 0, 100, 0, d, false);//f9
                            break;
                        case 121:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x44, r, g, b);
                            led.LogiLedPulseSingleKey(0x44, r, g, b, 0, 100, 0, d, false);//f10
                            break;
                        case 122:
                           // led.LogiLedSetLightingForKeyWithKeyName(0x57, r, g, b);
                            led.LogiLedPulseSingleKey(0x57, r, g, b, 0, 100, 0, d, false);//f11
                            break;
                        case 123:
                            //led.LogiLedSetLightingForKeyWithKeyName(0x58, r, g, b);
                            led.LogiLedPulseSingleKey(0x58, r, g, b, 0, 100, 0, d, false);//f12
                            break;
                       // case 42:

                            //led.LogiLedSetLightingForKeyWithKeyName(311, r, g, b); //prntscrn
                           // break;
                        case 145:
                            led.LogiLedPulseSingleKey(0x46, r, g, b, 0, 100, 0, d, false); //ScrollLock
                            break;
                        case 19:
                            led.LogiLedPulseSingleKey(0x145, r, g, b, 0, 100, 0, d, false);
                            //led.LogiLedSetLightingForKeyWithKeyName(0x145, r, g, b); //Pause/Break
                            break;

                        default:
                            break;


                    }
                    //System.out.println(event);
                }


            });


            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Err");
                }
            }
        }

    public void start(){
        t = new Thread(this);
        t.start();

    }
    public void interrupt(){
        Thread.currentThread().interrupt();
    }



}