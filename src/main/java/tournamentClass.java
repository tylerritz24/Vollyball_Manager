import java.util.ArrayList;

public class tournamentClass {

    private ArrayList courtList = new ArrayList();

    public  ArrayList getCourtList() {
        return courtList;
    }

    public String groupCourtSorting(String[] teamName){

        String court = courtAssignment();
        // asignment to all members of team
        // record name and make new list for court check to compare too
        return court;
    }

    public String singleCourtSorting(String name){

        String court = courtAssignment();

        return court;
    }

    private String courtAssignment(){
        // asign a court bassed on the order (simple for loop)
        return "No courts at the moment.";
    }

    private Boolean courtCheck(){
       return true;
    }
    /// need method to asign courts and check that courts arnt already in use
}
