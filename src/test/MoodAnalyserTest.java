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
             MoodAnalyser modAnalyser = new MoodAnalyser();

             String mood = modAnalyser.analyseMood("this is my message");

            Assert.assertThat(mood, CoreMatchers.is(value:"MY"));
        }
    }
