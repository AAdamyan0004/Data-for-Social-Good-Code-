import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

   String animalType = "";
   String gender = "";
   String symptom = "";
   String symptom2 = "";
//Variables to store the users input
    
   UserStory data = new UserStory("animal_type.txt","gender.txt","symptom.txt", "diseases.txt","symptom2.txt");
    //Creates a UserStory object using data files
   Scanner userInput = new Scanner(System.in);

   System.out.println("Hello, Welcome To Our Disease Prediction App!" + "\n \n" + "DISCLAIMER!! Not All Information Will Be 100% Accurate, It Would Still Be Best To Consult A Veterinarian" 
                      + "\n \n" + "If You Are Unsure Of What To Input, Look At The Items In The Parenthesis Next To The Prompt" + "\n \n" + "Enter animal type (Dog / Cat / Cow / Horse / Rabbit / Sheep / Goat / Pig): ");
   animalType = userInput.nextLine();
   animalType = animalType.toLowerCase();

    //Introduction message of how to use the app and disclaimer as well as prompting the animal type

   System.out.println("\n" + "Enter animal gender (Male / Female): ");
   gender = userInput.nextLine();
   gender = gender.toLowerCase();

    //Message prompting the animals gender

   System.out.println("\n" + "Enter animal symptom (Fever / Coughing / Diarrhea / Lethargy / Lameness / Vomiting / Labored Breathing / Skin Lesions / Decreased Milk Yield / Appetite Loss / Nasal Discharge / Eye Discharge / Sneezing / Loss of Appetite / Swollen Joints / Weight Loss): ");
   symptom = userInput.nextLine();
   symptom = symptom.toLowerCase();

   //Message prompting the animals first symptom
    
   System.out.println("\n" + "Enter second symptom (Lethargy / Sneezing / Nasal Discharge / Vomiting / Appetite Loss / Loss of Appetite / Labored Breathing / Fever / Coughing / Decreased Milk Yield / Reduced Milk Production / Eye Discharge / Diarrhea / Swelling / Swollen Joints / Weight Loss / Lameness / Dehydration / Reduced Wool Production / Swollen Legs): ");
   symptom2 = userInput.nextLine();
   symptom2 = symptom2.toLowerCase();

    //Message prompting the animal's second symptom

   System.out.println(data.findDisease(animalType,gender,symptom,symptom2));

  }

}
