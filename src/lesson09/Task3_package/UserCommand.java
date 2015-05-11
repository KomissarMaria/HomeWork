package lesson09.Task3_package;

import java.util.Arrays;

public class UserCommand {
    private String name = ""; // clone, sort,compare
    private String[] params;

    public UserCommand(String inputLine) {
        if (inputLine == null) return;
        if ("".equals(inputLine.trim())) return;
        String[] words = inputLine.split(" ");
        if (words.length > 0) {
            name = words[0];
            int paramsLen = words.length - 1;
            if (paramsLen > 0) {
                params = new String[paramsLen];
                System.arraycopy(words, 1, params, 0, paramsLen);
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getParam(int paramIndex) {
        return params[paramIndex];
    }

    public String[] getParams() {
        return Arrays.copyOf(params, params.length);
    }
}

