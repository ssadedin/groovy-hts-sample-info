// vim: ts=4:sw=4:expandtab:cindent:
/*
 * Copyright (c) 2016 MCRI, authors
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

enum Sex {
	MALE, FEMALE, OTHER, UNKNOWN
	
    private static codes = [
            1 : MALE,
            2 : FEMALE,
            "1" : MALE,
            "2" : FEMALE,
            "male" : MALE,
            "MALE" : MALE,
            "female": FEMALE,
            "FEMALE": FEMALE,
            "Male" : MALE,
            "Female": FEMALE,
            "Unknown" : UNKNOWN, 
            "UNKNOWN" : UNKNOWN,
            "unknown" : UNKNOWN,
            "other" : UNKNOWN // ped file compatibility
    ]
    
    String encode() {
        switch(this) {
            case MALE: "Male"; break
            case FEMALE: "Female"; break
            case OTHER: "Other"; break;
            case UNKNOWN: "Unknown"; break;
        }
    }
        
	static Sex decode(def  value) {
        if(value instanceof String)
            value = value?.trim()
		if(!value)
			return FEMALE
            
        if(codes.containsKey(value))
            return codes[value]

		throw new IllegalArgumentException("Bad sex value [$value] specified")
	}
}
