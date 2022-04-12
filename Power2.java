package power2;
import java.util.Scanner;

public class Power2 {

	public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        float A,B,C;
        
       
        
        System.out.println("Consumption of device A / min");
        
        A=input.nextFloat();
            while(true){
            if (A>=1&&A<1200)
                break;
            System.out.println("The rating should be between 1 and 1200... kindly recheck your inputs");
            System.out.println("Consumption of device A / min again!");
            A=input.nextFloat();
        }
        
        
            System.out.println("Consumption of device B / min");
            B=input.nextFloat();
            while(true){
            if (B>=1&&B<1200)
                break;
            System.out.println("The rating should be between 1 and 1200... kindly recheck your inputs");
            System.out.println("Consumption of device B / min again!");
            B=input.nextFloat();
        }
  
        
            System.out.println("Consumption of device C / min");
            C=input.nextFloat();
            while(true){
            if (C>=1&&C<1200)
                break;
            System.out.println("The rating should be between 1 and 1200... kindly recheck your inputs");
            System.out.println("Consumption of device C / min again!");
            C=input.nextFloat();
        }
       

        float time_hr_A = (1200 / A) / 60; 
        float time_hr_B = (1200 / B) / 60; 
        float time_hr_C = (1200 / C) / 60; 

        System.out.println("\nTime in Hours for device A before it switches off : " + time_hr_A + " hrs");
        System.out.println("Time in Hours for device B before it switches off : " + time_hr_B + " hrs");
        System.out.println("Time in Hours for device C before it switches off : " + time_hr_C + " hrs\n");

        float[] data = {time_hr_A, time_hr_B, time_hr_C};
        float greater = data[0];

        for(int i = 0; i< data.length; i++)
        {
            if(greater < data[i]) 
            greater = data[i];
        }

        System.out.println("Total time taken before all devices are switched off : " + greater + " hrs");

        float total_time_in_min_A = 1200 / A;
        float total_time_in_min_B = 1200 / B;
        float total_time_in_min_C = 1200 / C;

        System.out.println("\nA takes "+total_time_in_min_A + " mins");
        System.out.println("B takes "+total_time_in_min_B + " mins");
        System.out.println("C takes "+total_time_in_min_C + " mins\n");

        float amount_A_30 = 0,amount_A_above_30 = 0, total_amount_of_A = 0, amount_B_30 = 0, amount_B_above_30 = 0, total_amount_of_B = 0, amount_C_30 = 0, amount_C_above_30 = 0, total_amount_of_C = 0;

        if(total_time_in_min_A <= 30)
        {
            amount_A_30 = total_time_in_min_A * 60 * 10;
            total_amount_of_A = amount_A_30;

        }else{
            amount_A_30 = 30 * 60 * 10;
            amount_A_above_30 = (total_time_in_min_A - 30) * 60 * 5;
            total_amount_of_A = amount_A_30 + amount_A_above_30;
        }

        if(total_time_in_min_B <= 30)
        {
            amount_B_30 = total_time_in_min_B * 60 * 10;
            total_amount_of_B = amount_B_30;

        }else{
            amount_B_30 = 30 * 60 * 10;
            amount_B_above_30 = (total_time_in_min_B - 30) * 60 * 5;
            total_amount_of_B = amount_B_30 + amount_B_above_30;
        }

        if(total_time_in_min_C <= 30)
        {
            amount_C_30 = total_time_in_min_C * 60 * 10;
            total_amount_of_C = amount_C_30;

        }else{
            amount_C_30 = 30 * 60 * 10;
            amount_C_above_30 = (total_time_in_min_C - 30) * 60 * 5;
            total_amount_of_C = amount_C_30 + amount_C_above_30;
        }

        System.out.println("\nTotal amount for device A : " +total_amount_of_A + " shillings");
        System.out.println("Total amount for device B : " +total_amount_of_B + " shillings");
        System.out.println("Total amount for device C : " +total_amount_of_C + " shillings\n");

        float total_amount_of_all_devices = total_amount_of_A + total_amount_of_B + total_amount_of_C;

        System.out.println("Total amount for all devices : " + total_amount_of_all_devices + " shillings");

    }

}
