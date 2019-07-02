package test;

import chap2.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
    {
        @Test
        public void testMoodAnalyser() throws Exception
        {
             MoodAnalyser moodAnalyser = new MoodAnalyser();

             String mood = moodAnalyser.analyseMood("this is my message");

            Assert.assertThat(mood, CoreMatchers.is( "MY"));
        }

        @Test
        public void happyMessage() throws Exception
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("this is my happy message");

            Assert.assertThat(mood, CoreMatchers.is("Happy"));
        }
    }
