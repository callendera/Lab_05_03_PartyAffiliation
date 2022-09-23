// class PartyAffiliation
public class Main {
    //   main()
    public static void main(String[] args) {

        // string partyAff
        String partyAff;
        //  output “Please enter your party affiliation (Democrat, Republican, or    Independent): “
        System.out.println("Please enter your party affiliation (D = Democrat, R = Republican, or I = Independent): ");

        // input partyAff
        partyAff = "r";
        System.out.println("Simulated Party Affiliation: " + partyAff);

        //if partyAff = “Democrat”
        if(partyAff.equalsIgnoreCase("D")){
            // output “You get a Democratic Donkey.”
            System.out.println("You get a Democratic Donkey.");
        // else if partyAff = “Republican”
        } else if (partyAff.equalsIgnoreCase("R")) {
            //output “You get a Republican Elephant.”
            System.out.println("You get a Republican Elephant.");
            //else if partyAff = “Independent”
        } else if (partyAff.equalsIgnoreCase("I")) {
            //output “You get an Independent Man”
            System.out.println("You get an independent Man.");
            //else
        } else {
            //output “You did not input a correct response”
            System.out.println("You did not input a correct response");
        } //  endif

    } //  return
} //  endclass