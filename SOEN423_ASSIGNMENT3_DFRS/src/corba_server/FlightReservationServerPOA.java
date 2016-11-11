package corba_server;


/**
* corba_server/FlightReservationServerPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Jerem/Source/Repos/workspace/SOEN423_ASSIGNMENT3_DFRS/src/corba_server/FlightReservationServer.idl
* Friday, November 11, 2016 1:58:05 AM EST
*/

public abstract class FlightReservationServerPOA extends org.omg.PortableServer.Servant
 implements corba_server.FlightReservationServerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("bookFlight", new java.lang.Integer (0));
    _methods.put ("getBookedFlightCount", new java.lang.Integer (1));
    _methods.put ("editFlightRecord", new java.lang.Integer (2));
    _methods.put ("transferReservation", new java.lang.Integer (3));
    _methods.put ("getFlightRecords", new java.lang.Integer (4));
    _methods.put ("getFlightReservations", new java.lang.Integer (5));
    _methods.put ("getPassengerRecords", new java.lang.Integer (6));
    _methods.put ("getManagerRecords", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // corba_server/FlightReservationServer/bookFlight
       {
         String firstName = in.read_string ();
         String lastName = in.read_string ();
         String address = in.read_string ();
         String phoneNumber = in.read_string ();
         String destination = in.read_string ();
         String date = in.read_string ();
         String flightClass = in.read_string ();
         String $result = null;
         $result = this.bookFlight (firstName, lastName, address, phoneNumber, destination, date, flightClass);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // corba_server/FlightReservationServer/getBookedFlightCount
       {
         String bookedFlightCountRequest = in.read_string ();
         String $result = null;
         $result = this.getBookedFlightCount (bookedFlightCountRequest);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 2:  // corba_server/FlightReservationServer/editFlightRecord
       {
         String editFlightRecordRequest = in.read_string ();
         String fieldToEdit = in.read_string ();
         String newValue = in.read_string ();
         String $result = null;
         $result = this.editFlightRecord (editFlightRecordRequest, fieldToEdit, newValue);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 3:  // corba_server/FlightReservationServer/transferReservation
       {
         String transferReservationRequest = in.read_string ();
         String currentCity = in.read_string ();
         String otherCity = in.read_string ();
         String $result = null;
         $result = this.transferReservation (transferReservationRequest, currentCity, otherCity);
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 4:  // corba_server/FlightReservationServer/getFlightRecords
       {
         String $result[] = null;
         $result = this.getFlightRecords ();
         out = $rh.createReply();
         corba_server.stringsHelper.write (out, $result);
         break;
       }

       case 5:  // corba_server/FlightReservationServer/getFlightReservations
       {
         String $result[] = null;
         $result = this.getFlightReservations ();
         out = $rh.createReply();
         corba_server.stringsHelper.write (out, $result);
         break;
       }

       case 6:  // corba_server/FlightReservationServer/getPassengerRecords
       {
         String $result[] = null;
         $result = this.getPassengerRecords ();
         out = $rh.createReply();
         corba_server.stringsHelper.write (out, $result);
         break;
       }

       case 7:  // corba_server/FlightReservationServer/getManagerRecords
       {
         String $result[] = null;
         $result = this.getManagerRecords ();
         out = $rh.createReply();
         corba_server.stringsHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corba_server/FlightReservationServer:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public FlightReservationServer _this() 
  {
    return FlightReservationServerHelper.narrow(
    super._this_object());
  }

  public FlightReservationServer _this(org.omg.CORBA.ORB orb) 
  {
    return FlightReservationServerHelper.narrow(
    super._this_object(orb));
  }


} // class FlightReservationServerPOA
