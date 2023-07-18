/**
 * A program to carry on conversations with a human user.
 * This version:
 *      - Uses advanced search for keywords
 *      - Will transform statements as well as react to keywords

 * Code adapted from work by Laurie White for the College Board.
 *
 * @Daniel Boktor
 * @April 21 2023
 *
 */
public class Magpie4
{
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        int position = findKeyword(statement, "you", 0);
        int iPosition = findKeyword(statement,"I", 0);
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }

        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "mother") >= 0
                || findKeyword(statement, "father") >= 0
                || findKeyword(statement, "sister") >= 0
                || findKeyword(statement, "brother") >= 0)
        {
            response = "Tell me more about your family.";
        }

        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
        else if (iPosition>=0 && findKeyword(statement,"you", iPosition)>=0){
                response = transformIYouStatement(statement);
        }
        else if (position >= 0 && findKeyword(statement, "me", position) >= 0)
            {
                response = transformYouMeStatement(statement);
            }   
        else{
            // Look for a two word (you <something> me) pattern
            response = getRandomResponse();}
        return response;
    }
    private String transformIYouStatement(String statement)
    {
        statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}

		int psnOfI = findKeyword (statement, "I", 0);
		int psnOfYou = findKeyword (statement, "you", psnOfI + 1);

		String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
		return "Why do you " + restOfStatement + " me?";
    }

    /**
     * Take a statement with "I want to <something>." and transform it into
     * "What would it mean to <something>?"
     * @param statement: the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);

        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(position + 9).trim();
        return "Would you really be happy if you had " + restOfStatement + "?";
    }



    /**
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement: the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);

        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }

        int positionOfYou = findKeyword (statement, "you", 0);
        int positionOfMe = findKeyword (statement, "me", positionOfYou + 3);

        String restOfStatement = statement.substring(positionOfYou + 3, positionOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").
     * @param statement: the string to search
     * @param goal: the string to search for
     * @param startPos: the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int position = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word
        while (position >= 0)
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (position > 0)
            {
                before = phrase.substring (position - 1, position).toLowerCase();
            }
            if (position + goal.length() < phrase.length())
            {
                after = phrase.substring(position + goal.length(), position + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return position;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            position = phrase.indexOf(goal.toLowerCase(), position + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
     * @param statement: the string to search
     * @param goal: the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }



    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        String[] responseArr = new String[10];
        responseArr[0] = "Interesting, tell me more.";
        responseArr[1] = "Hmmm.";
        responseArr[2] = "Do you really think so?";
        responseArr[3] = "You don't say.";
        responseArr[4] = "That's peculiar.";
        responseArr[5] = "How strange.";
        if (whichResponse == 0)
        {
            response = responseArr[0];
        }
        else if (whichResponse == 1)
        {
            response = responseArr[1];
        }
        else if (whichResponse == 2)
        {
            response = responseArr[2];
        }
        else if (whichResponse == 3)
        {
            response = responseArr[3];
        }
        else if (whichResponse == 4)
        {
            response = responseArr[4];
        }
        else if (whichResponse == 5)
        {
            response = responseArr[5];
        }

        return response;
    }

}
