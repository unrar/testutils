/*
 * 
 * This contains the test utils files for TestApp.
 * 
 */
package com.testapp.testutils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class to debug
 * @author catbuntu
 */
public class Debugator {
    
    // Controller for kController
    public Boolean kInstantiator = false;
    
    /**
     * @param none No arguments
     */
    public String debugLog() {
        // Datator object for giving us dates
        Date datator = new Date();
        // Format the date
        SimpleDateFormat formator = 
        new SimpleDateFormat ("yyyy/MM/dd, HH:mm:ss");
        return "@Debug (" + formator.format(datator).toUpperCase() + "): ";
    }
    
    /**
     * Class to return the value of the kInstantiator
     * 
     * @param ret Boolean Reset the kInstantiator value?
     * @return bool Value of the kInstantiator
     */
    public Boolean kControler(Boolean ret) {
        if (kInstantiator == true) {
            // Reset if ret == true
            if (ret == true) {
                kInstantiator = false;
            }
            System.out.println(this.debugLog() + "Found a true instance of kInstantiator.");
            return true;
            
        } else {
            // Reset if ret == true
            if (ret == true) {
                kInstantiator = false;
            }
            System.out.println(this.debugLog() + "Found a false or null instance of kInstantiator.");
            return false;
        }

    }
}
