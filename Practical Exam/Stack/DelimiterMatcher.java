class DelimiterMatcher {
    private Stack stack;

    public DelimiterMatcher(int size) {
        stack = new Stack(size);
    }

    public boolean isDelimiterMatched(String input) {
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}