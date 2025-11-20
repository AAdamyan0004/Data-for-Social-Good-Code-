import java.util.Scanner;

public class UserStory {
  private String[] animalType;
  private String[] gender;
  private String[] symptom;
  private String[] secondSymptom;
  private String[] diseases;
//Instance variables to store array

  public UserStory(){
    this.animalType = new String [0];
    this.gender = new String [0];
    this.symptom = new String [0];
    this.diseases = new String [0];
    this.secondSymptom = new String [0];
  }
//No argument constructor that sets default values

  public UserStory(String animalTypeFile, String genderFile, String symptomFile, String diseaseFile, String symptom2File){
    this.animalType = FileReader.toStringArray(animalTypeFile);
    this.gender = FileReader.toStringArray(genderFile);
    this.symptom = FileReader.toStringArray(symptomFile);
    this.diseases = FileReader.toStringArray(diseaseFile);
    this.secondSymptom = FileReader.toStringArray(symptom2File);
  }
  //Constructor that sets data from selected files

  public String findDisease(String animalTypeInput, String genderInput, String symptomInput, String secondSymptomInput){
    for(int i = 0; i < animalType.length; i++){
      String t = animalType[i].toLowerCase();
      String g = gender[i].toLowerCase();
      String s = symptom[i].toLowerCase();
      String s2 = secondSymptom[i].toLowerCase();

      if(t.equals(animalTypeInput.toLowerCase()) && g.equals(genderInput.toLowerCase()) && s.equals(symptomInput.toLowerCase()) && s2.equals(secondSymptomInput.toLowerCase())){
          return "\n" + "Using that information, we believe that your pet may have: " + diseases[i];
      }
    }
    return "\n" + "Unfortunately, There Is No Disease That Can Be Predicted From Those Specifications, We Would Recommend To Speak With a Veterinarian" + "\n" + "Best Regards.";
  }
/**
Filters through the data using a loop
Checks if user's input matches the index in the 1D array
Not case sensitive by using toLowerCase()
If user's input matches an index, program will return the disease at that index
Otherwise will return a default message to user
  */
public String toString(){
String result = "";
  for (int i = 0; i < animalType.length; i++){
    result += "Animal: " + animalType[i] + "\n" +  "Gender: " + gender[i] + "\n" +  
      "First Symptom: " + symptom[i] + "\n" + "Second Symptom: " + secondSymptom[i] + "\n" +  "Disease: " + diseases[i] + "\n \n";
}
  return result;
}
  /**
  toString method to enable printing out data also formats the data to be spaced out
  */
}
