public class StateDemo {

    public static void main( String[] args ) {

        // Construct state objects.
        State firstState = new State();
        State secondState = new State();
        State thirdState = new State();

        //prompt user for data
        System.out.println( "Please enter the first state: " );
        firstState.setStateName( "" );

        //prompt user for data
        System.out.println( "Please enter the first state's population: " );
        firstState.setPopulation( 0 );

        //prompt user for data
        System.out.println( "Please enter the second state: " );
        secondState.setStateName( "" );

        //prompt user for data
        System.out.println( "Please enter the second state's population: " );
        secondState.setPopulation( 0 );

        //prompt user for data
        System.out.println( "Please enter the third state: " );
        thirdState.setStateName( "" );

        //prompt user for data
        System.out.println( "Please enter the third state's population: " );
        thirdState.setPopulation( 0 );

        //return data to console
        System.out.println( firstState.toString() );
        System.out.println( secondState.toString() );
        System.out.println( thirdState.toString() );
    }
}
