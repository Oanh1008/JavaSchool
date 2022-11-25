/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Closeable;

/**
 *
 * @author Oanhpv1008
 */
public class AutoClose {
    
    
    public static void close(AutoCloseable...closeables){
        for(AutoCloseable closeable:closeables){
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }
}
