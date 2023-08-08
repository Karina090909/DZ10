import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void setCurrentStationRegularTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int actual = radio.getCurrenStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationCountTest() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(5);
        radio.setCurrentStation(15);

        int actual = radio.getCurrenStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentStationNineTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.setCurrentStation(13);
        int actual = radio.getCurrenStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationZeroTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.setCurrentStation(-5);
        int actual = radio.getCurrenStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.next();
        int actual = radio.getCurrenStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextNineTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrenStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextOverNineTest() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(14);
        radio.next();
        int actual = radio.getCurrenStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.prev();
        int actual = radio.getCurrenStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevZeroTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrenStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevOverZeroTest() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrenStation();
        int expected = 14;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume100Test() {
        Radio radio = new Radio();

        radio.setCurrentVolume(105);
        radio.setCurrentVolume(15);
        int actual = radio.getCurrentVolume();
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeZeroTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(33);
        radio.setCurrentVolume(-2);
        int actual = radio.getCurrentVolume();
        int expected = 33;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume100Test() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZeroTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
        //Прибавление громкости
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
