/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //REFERENCIAS
        final char CAR_MAX = 'A';
        final char CAR_MIN = 'Z';
        final int CUENTA_INI = 0;
        final int CUENTA_FIN = 9;
    

        //INICIALIZACION
        int i = CUENTA_INI;
            
        // SALIDA CONSOLA
        System.out.print("Password...: ");

        //BUCLE
        do {
           char caracter = (char) (RND.nextInt(CAR_MAX - CAR_MIN + 1) + CAR_MIN); // [CAR_MIN .. CAR_MAX]
            
            //ACTUALIZACION
            i++;
            // SALIDA CONSOLA
            System.out.printf("%c", caracter);
        } while (i < CUENTA_FIN);
    }
}
