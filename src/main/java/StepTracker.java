import java.util.ArrayList;
public class StepTracker
{
 private int totalDays,actDays;
 private int minSteps, totalSteps;
 public StepTracker(int target){
  minSteps = target;
  totalSteps = 0;
  totalDays = 0;
  actDays = 0;
 }
 public void addDailySteps(int steps){
  totalSteps += steps;
  totalDays++;
  actDays++;
 }
 public int activeDays(){
  if(totalDays==0)
   return 0.0;
  else
   return (double)totalSteps/totalDays;
 }
} 
