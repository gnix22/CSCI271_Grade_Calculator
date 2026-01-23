// headerCheck helper function. realized this is a very difficult task and likely involves a linked list and a sorting algorithm. outside of time limit at the moment,
// still want to come back to this... (goes in StudentInformation class)
//private static String[] headerCheck(String header) throws InformationOutOfBoundsException{
// implement header check and reformat string to work with the example csv from project..
// probably start with line split and then check each parse...
//    String[] values = header.split(",");
// want it formatted like example, that is, [StudentName,A1-A7,T1-T7,Midterm,Final]
//    String[] reformattedHeaderArray = new String[17];
//    if(values.length < 17 || values.length > 18){
//        throw new InformationOutOfBoundsException("please ensure the following information is satisfied as columns: [StudentName,A1-A7,T1-T7,Midterm,Final].");
//    }
// for each value in the array, check first character, and order
// doesn't necessarily matter order of a1,a6,a5,etc in this case as addition is commutative, and the sums will be taken anyways, so as long as counts match in 
// indices in above setStudentInfo.
//    for(int idx = 0; idx < values.length; idx++){
//        String searchValue = values[idx];
//        if(searchValue.charAt(0) == 'S'){
//            reformattedHeaderArray[0] = searchValue; // gives StudentName to index 0
//        } else if(searchValue.charAt(0) == 'A' && ){
//            for(int assignmentCount=0; assignmentCount < 7; assignmentCount++){
//                reformattedHeaderArray[assignmentCount+1]= 
//            }
//        }
//    }
//    return reformattedHeaderArray;
//}
