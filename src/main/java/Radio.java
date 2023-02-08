public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            currentStation = 9;
        }
        if (currentStation < 0) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }
    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void prevVolume() {
        if (currentVolume > 1) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

}
