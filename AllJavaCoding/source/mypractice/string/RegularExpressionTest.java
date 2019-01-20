package mypractice.string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 6/9/15
 * Time: 12:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegularExpressionTest {

    private List<String> inputSanitizationList = new LinkedList<String>();
    private Map<String, String> regularExpressionMap = new TreeMap<String, String>();
    private Map<String, String> parameterValuesMap = new TreeMap<String, String>();
    private Map<String, String> parameterValuesMapManual = new TreeMap<String, String>();

    {
        inputSanitizationList.add("refPage");
        inputSanitizationList.add("targetPage");
        inputSanitizationList.add("select_caseid");

        parameterValuesMapManual.put("refPage","RG");
        parameterValuesMapManual.put("targetPage","EDIT");
        parameterValuesMapManual.put("select_caseid","232649|steelfab, inc");
    }

    public static void main(String[] args) {
        new RegularExpressionTest().patternMatcherTest();
    }

    public void patternMatcherTest() {
        String regexCaseId = "\\D";
        String caseNameRegex = "[^\\d \\s \\w ' , / & . - ! @ # $ *]";
        String wordExpression = "\\W";
        String wordOrSpaceExpression = "[^\\s \\w]";

        for (String param : inputSanitizationList) {
            String parameterValue = parameterValuesMapManual.get(param);
            if (param != null && parameterValue != null) {
                if ("select_caseid".equals(param)) {
                    if (parameterValue.indexOf("|") > -1) {
                        StringTokenizer st = new StringTokenizer(parameterValue, "|");
                        if (st.hasMoreTokens()) {
                            switch (st.countTokens()) {
                                case 1:
                                    String caseId = st.nextToken();
                                    parameterValuesMap.put("caseId", caseId);
                                    regularExpressionMap.put("caseId", regexCaseId);
                                    break;
                                case 2:
                                    caseId = st.nextToken();
                                    String clientName = st.nextToken();
                                    parameterValuesMap.put("caseId", caseId);
                                    regularExpressionMap.put("caseId", regexCaseId);
                                    parameterValuesMap.put("clientName", clientName);
                                    regularExpressionMap.put("clientName", caseNameRegex);

                                    break;
                                case 3:
                                    caseId = st.nextToken();
                                    clientName = st.nextToken();
                                    String flag = st.nextToken();
                                    parameterValuesMap.put("caseId", caseId);
                                    regularExpressionMap.put("caseId", regexCaseId);
                                    parameterValuesMap.put("clientName", clientName);
                                    regularExpressionMap.put("clientName", caseNameRegex);
                                    parameterValuesMap.put("flag", flag);
                                    regularExpressionMap.put("flag", wordExpression);

                                    break;
                                case 4:
                                    caseId = st.nextToken();
                                    clientName = st.nextToken();
                                    flag = st.nextToken();
                                    String clientId = st.nextToken();
                                    parameterValuesMap.put("caseId", caseId);
                                    regularExpressionMap.put("caseId", regexCaseId);
                                    parameterValuesMap.put("clientName", clientName);
                                    regularExpressionMap.put("clientName", caseNameRegex);
                                    parameterValuesMap.put("flag", flag);
                                    regularExpressionMap.put("flag", wordExpression);
                                    parameterValuesMap.put("clientId", clientId);
                                    regularExpressionMap.put("clientId", regexCaseId);

                                    break;
                                case 5:
                                    caseId = st.nextToken();
                                    clientName = st.nextToken();
                                    flag = st.nextToken();
                                    clientId = st.nextToken();
                                    String subProducerName = st.nextToken();
                                    parameterValuesMap.put("caseId", caseId);
                                    regularExpressionMap.put("caseId", regexCaseId);
                                    parameterValuesMap.put("clientName", clientName);
                                    regularExpressionMap.put("clientName", caseNameRegex);
                                    parameterValuesMap.put("flag", flag);
                                    regularExpressionMap.put("flag", wordExpression);
                                    parameterValuesMap.put("clientId", clientId);
                                    regularExpressionMap.put("clientId", regexCaseId);
                                    parameterValuesMap.put("subProducerName", subProducerName);
                                    regularExpressionMap.put("subProducerName", caseNameRegex);

                                    break;
                                default:
                                    break;
                            }
                        }
                    } else {
                        parameterValuesMap.put("caseId", parameterValue);
                        regularExpressionMap.put("caseId", wordOrSpaceExpression);
                    }
                } else {
                    parameterValuesMap.put(param, parameterValue);
                    regularExpressionMap.put(param, regexCaseId);
                }
            }
        }

        if (vulnerabilityFound(parameterValuesMap, regularExpressionMap))
            System.out.println("There some issue with the input");
     else
            System.out.println("Input is just fine");
    }

    public boolean vulnerabilityFound(Map<String, String> inputValuesMap, Map<String, String> regExMap) {
        boolean throwError = false;
        for (String key : inputValuesMap.keySet()) {
            Pattern pattern = Pattern.compile(regExMap.get(key));
            Matcher matcher = pattern.matcher(inputValuesMap.get(key));
            if (matcher.find()) {
                throwError = true;
            }
        }
        return throwError;
    }
}

