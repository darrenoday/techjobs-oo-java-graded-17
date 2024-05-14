package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job testJobOne = new Job();
        Job testJobTwo = new Job();

        assertNotEquals(testJobOne.getId(), testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof  Employer);
        assertTrue(testJob.getLocation() instanceof  Location);
        assertTrue((testJob.getPositionType() instanceof PositionType));
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());


    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
Job testNewLineJob = new Job("testing",new Employer("testing"),new Location("testing"),new PositionType("testing"),new CoreCompetency("testing"));
   assertEquals(testNewLineJob.toString(),System.lineSeparator() + "ID: 1" +System.lineSeparator() +
           "Name: testing" + System.lineSeparator() +
           "Employer: testing" + System.lineSeparator() +
           "Location: testing" + System.lineSeparator() +
           "Position Type: testing" + System.lineSeparator() +
           "Core Competency: testing" + System.lineSeparator());


    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Software Developer", new Employer("ABC Corp"), new Location("New York"), new PositionType("Full Stack"), new CoreCompetency("Java"));

        assertTrue(job.toString().contains("ID:"));
        assertTrue(job.toString().contains("Name:"));
        assertTrue(job.toString().contains("Employer:"));
        assertTrue(job.toString().contains("Location:"));
        assertTrue(job.toString().contains("Position Type:"));
        assertTrue(job.toString().contains("Core Competency:"));
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals(job.toString(),System.lineSeparator() + "ID: 1" + System.lineSeparator() +
        "Name: Data not available" + System.lineSeparator() +
        "Employer: Data not available" + System.lineSeparator() +
        "Location: Data not available" + System.lineSeparator() +
        "Position Type: Data not available" + System.lineSeparator() +
        "Core Competency: Data not available" + System.lineSeparator());

    }

}

