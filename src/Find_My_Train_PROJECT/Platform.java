package Find_My_Train_PROJECT;

public class Platform {
    private int platFormNumber;
    private Train train;

    //hum sirf platformnumber ke liye constructor banayenge train ke liye nahi...kyu ki jarrori nahi hai ki train hamesha platform pe khadi rahe...vo platform khali bhi ho sakta hai naa...

    public Platform(int platFormNumber){
        this.platFormNumber=platFormNumber;
    }

    public int getPlatFormNumber() {
        return platFormNumber;
    }

    public void setPlatFormNumber(int platFormNumber) {
        this.platFormNumber = platFormNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platFormNumber=" + platFormNumber +
                ", train=" + train +
                '}';
    }
}
