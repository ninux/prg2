/*
 * This is a part of the "PRG2" source from the github repository prg2
 * which is available at http://github.com/ninux/prg2
 *
 * Copyright (C) 2014, Ervin Mazlagic (aka. ninux, Nino Ninux)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package test;

/**
 * 
 * @author ninux
 */
public class Main {
    static public void main(String[] args){
    	String copyright = "PRG2 Copyright (C) 2014 Ervin Mazlagic";
	String warranty = "This program comes with ABSOLUTELY NO WARRANTY.";
	String license = "This is free software as defined by GPLv3. \n"
		+ "You can modify and redistribute it under "
		+ "certain conditions (see GPLv3).";
	String hiGPL = (copyright + "\n" + warranty + "\n" + license);

	System.out.println(hiGPL);
    }
} 