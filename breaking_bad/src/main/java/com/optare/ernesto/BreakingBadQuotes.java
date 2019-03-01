package com.optare.ernesto;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static com.google.common.base.Preconditions.*;


/**
 * This class with ask Breaking Bad Quotes service for some quotes and do stuff
 * with them.
 *
 */
public class BreakingBadQuotes {
    static Logger logger= LoggerFactory.getLogger(BreakingBadQuotes.class);

    private int n;
    private String file1;
    private String file2;

    private BreakingBadQuotes(){

    }

    public static BreakingBadQuotes getInstance(){
        return new BreakingBadQuotes();
    }

    public BreakingBadQuotes setN(int n) {
        this.n = n;
        return this;
    }

    public BreakingBadQuotes setFile1(String file1) {
        this.file1 = file1;
        return this;
    }

    public BreakingBadQuotes setFile2(String file2) {
        this.file2 = file2;
        return this;
    }

    public static void main(String[] args){
        List<String> arguments =Arrays.asList(args);
        Integer n=null;
        String file1Str=null,file2Str=null;
        File file1=null,file2=null;

        try {
            if (arguments != null && arguments.size() == 3) {
                n=Integer.parseInt(arguments.get(0));
                file1Str=arguments.get(1);
                file2Str=arguments.get(2);

                checkNotNull(n,"you didn't passed the number of quotes");
                checkNotNull(file1Str,"you didn't passed the name of the first file");
                checkNotNull(file2Str,"you didn't passed the name of the second file");

            } else {
                logger.error("You have to pass three arguments, you passed less");
            }
        }catch(NumberFormatException nf){
            logger.error("You passed wrong data type, required number");
        }catch(NullPointerException ne){
            logger.error("You didn't passed one argument."+ne.getMessage());
        }



        logger.debug("Inputs are correct");

    }
}