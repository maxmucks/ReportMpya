package org.deafop.deafopreport;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ReportUtil {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    public static FirebaseAuth mFirebaseAuth;
    public static FirebaseAuth.AuthStateListener mAuthListener;
    private static ReportUtil ReportUtil;
    public static ArrayList<Report> mRepot;
     private ReportUtil(){}

     public static void openFBReference(String ref){
         if (ReportUtil == null){
             ReportUtil = new ReportUtil();

             mFirebaseDatabase = FirebaseDatabase.getInstance();
             mFirebaseAuth = FirebaseAuth.getInstance();

                     mRepot = new ArrayList<Report>();
         }
         mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
     }


}
