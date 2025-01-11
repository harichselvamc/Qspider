import java.util.*;

public class miggymart{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        //welcome message
        System.out.println("\t\t\t\tWelcome to the Miggymart\t\t\t");
        //list of the hotels
        System.out.println("Lists of the Hotels:\n 1.B2B-Veg \n 2.popeye-bhavan-halal Nonveg \n 3.Redbull-ChickenWing\n\n choose the hotel number you want to place the order....");
        int hotel_selection=sc.nextInt();
        switch (hotel_selection) {
            case 1:{
                System.out.println("\t\t\t\twelcome to B2B-Veg Hotel\t\t\t");
                System.out.println("Menu Items:\n 1.Dosa-120rs \n 2.White Idly 30rs \n 3.Cabbage Noodles - 120rs");
                System.out.print("Choose the which item food you want! : ");
                int food_item=sc.nextInt();
                switch(food_item){
                    case 1:{
                        System.out.println("You have selected the Dosa");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int dosa_quantity=sc.nextInt();
                        int dosa_price=120;
                        int dosa_bill=dosa_price*dosa_quantity;
                        System.out.println("The Total Bill Amount is "+dosa_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+dosa_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==dosa_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+dosa_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==dosa_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        
                        break;
                    }

                    case 2:{
                        System.out.println("You have selected the White Idly");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int idly_quantity=sc.nextInt();
                        int idly_price=30;
                        int idly_bill=idly_price*idly_quantity;
                        System.out.println("The Total Bill Amount is "+idly_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+idly_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==idly_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp = (int) (Math.random() * 11234);
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+idly_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==idly_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        
                        break;
                    }
                    case 3:{
                        System.out.println("You have selected the Noodles");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int noodles_quantity=sc.nextInt();
                        int noodles_price=120;
                        int noodles_bill=noodles_price*noodles_quantity;
                        System.out.println("The Total Bill Amount is "+noodles_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+noodles_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==noodles_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+noodles_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==noodles_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        break;
                    }

                    }
                    
                }

                break;
    
            case 2:{
                System.out.println("\t\t\t\twelcome to Popeye Bhavan Hotel\t\t\t");
                System.out.println("Menu Items:\n 1.Briyani-120rs \n 2.Crab Lollypop 30rs \n 3.Cabbage Noodles - 120rs");
                System.out.print("Choose the which item food you want! : ");
                int food_item=sc.nextInt();
                switch(food_item){
                    case 1:{
                        System.out.println("You have selected the Briyani");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int dosa_quantity=sc.nextInt();
                        int dosa_price=120;
                        int dosa_bill=dosa_price*dosa_quantity;
                        System.out.println("The Total Bill Amount is "+dosa_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+dosa_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==dosa_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+dosa_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==dosa_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        
                        break;
                    }

                    case 2:{
                        System.out.println("You have selected the White Crab Lollypop");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int idly_quantity=sc.nextInt();
                        int idly_price=30;
                        int idly_bill=idly_price*idly_quantity;
                        System.out.println("The Total Bill Amount is "+idly_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+idly_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==idly_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+idly_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==idly_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        
                        break;
                    }
                    case 3:{
                        System.out.println("You have selected the Noodles");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int noodles_quantity=sc.nextInt();
                        int noodles_price=120;
                        int noodles_bill=noodles_price*noodles_quantity;
                        System.out.println("The Total Bill Amount is "+noodles_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+noodles_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==noodles_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+noodles_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==noodles_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        break;
                    }

                    }
                    
                   break;
            
            }
            case 3:{
                System.out.println("\t\t\t\twelcome to RedBull Hotel\t\t\t");
                System.out.println("Menu Items:\n 1.Dosa-120rs \n 2.White Idly 30rs \n 3.Cabbage Noodles - 120rs");
                System.out.print("Choose the which item food you want! : ");
                int food_item=sc.nextInt();
                switch(food_item){
                    case 1:{
                        System.out.println("You have selected the Dosa");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int dosa_quantity=sc.nextInt();
                        int dosa_price=120;
                        int dosa_bill=dosa_price*dosa_quantity;
                        System.out.println("The Total Bill Amount is "+dosa_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+dosa_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==dosa_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+dosa_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==dosa_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        
                        break;
                    }

                    case 2:{
                        System.out.println("You have selected the White Idly");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int idly_quantity=sc.nextInt();
                        int idly_price=30;
                        int idly_bill=idly_price*idly_quantity;
                        System.out.println("The Total Bill Amount is "+idly_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+idly_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==idly_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+idly_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==idly_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        
                        break;
                    }
                    case 3:{
                        System.out.println("You have selected the Noodles");
                        System.out.print("Enter the Quantity ,you want to buy: ");
                        int noodles_quantity=sc.nextInt();
                        int noodles_price=120;
                        int noodles_bill=noodles_price*noodles_quantity;
                        System.out.println("The Total Bill Amount is "+noodles_bill);
                        Thread.sleep(3000);
                        System.out.println("Choose the Payment you want to proceed\n 1.Googlepay \n 2.Phone Pay");
                        int payment_option=sc.nextInt();
                        switch (payment_option) {
                           case 1: {
                            System.out.println("You have choosen Gpay payment mode....\n For Conformation please enter the bill amount shown here"+noodles_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==noodles_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("You have choosen Phone pe payment mode....\n For Conformation please enter the bill amount shown here"+noodles_bill+"\nEnter the bill amount: ");
                            int amount_verification=sc.nextInt();
                            if(amount_verification==noodles_bill){
                                System.out.println("Hence the Bill Amount is verified Successfully....");
                                int generated_otp=(int)Math.random()*299;
                                System.out.println("Please enter the OTP shown here "+generated_otp+" :");
                                int user_otp=sc.nextInt();
                                if(user_otp==generated_otp){
                                    System.out.println("OTP verified Successfully....");
                                    System.out.println("Thanks for your order");
                                    System.out.println("Order will deliver Soon..");
                                }else{
                                    System.out.println("Invalid OTP");
                                }

                            }else{
                                System.out.println("Bill Amount is invalid..");
                            }
                            break;
                        }
                        }
                        break;
                    }

                    }
                    
                }

                
                break;
            }
            
        }
    }
    
    

