package chap2;

public class MoodAnalyser {
    public String analyseMood(String message)
    {
        if (message.contains("MY"))
        {
            return "MY";
        }else
            return "Happy";
    }
}
