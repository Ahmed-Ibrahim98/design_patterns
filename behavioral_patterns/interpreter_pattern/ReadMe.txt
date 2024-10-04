Interpreter Design Pattern:
    # Introduction:
        ** It's a behavioral design pattern.
        ** provides a way to define a grammar for a language and an interpreter to evaluate sentences in that
           language.
        ** It's particularly useful for implementing domain-specific languages (DSLs) or parsing expressions.
        ** It's composed of five elements:
            1. Expression Interface:
                - Defines the common interface that all expressions must implement.
                - Typically includes an interpret() method that takes a Context object as input and returns a result.
            2. Terminal Expression:
                - Represents a terminal symbol in the grammar.
                - Implements the Expression interface.
                - Directly interprets itself without relying on other expressions.
            3. Non-terminal Expression:
                - Represents a non-terminal symbol in the grammar.
                - Implements the Expression interface.
                - Contains references to other expressions (terminal or non-terminal).
                - Interprets itself by interpreting its constituent expressions and combining their results
                  according to the grammar rules.
            4. Context:
                - Stores context-specific information that may be needed for interpretation.
                - Can be passed to the interpret() method of expressions.
            5. Client Code:
                - Creates an instance of the Context object.
                - Constructs an expression tree by layering expressions within expressions.
                - Calls the interpret() method on the outermost expression to initiate the interpretation process.
        ** How Expressions are interpreted: through recursive interpretation
            - The interpret() method is typically implemented recursively to evaluate nested expressions.
            - The outermost expression calls the interpret() method of its constituent expressions, which in
              turn call the interpret() method of their constituent expressions, and so on.
            - This recursive process continues until the innermost terminal expressions are reached and their
              values are returned.
    # Scenario:
        - suppose you want to write a language for writing arithmetic operation expressions.
        - this language for now only deals with integer numbers.
        - we want to be able to write arithmetic expressions like addition, subtraction, multiplication, and division
        - we want a way to evaluate the expressions that we write
        ** in the code example we wrote we will show how to make that kind of language and provide a method that
           interprets any expression written in that language. and the explanation for the code is down below

    # Code Breakdown:
        ** Expression: common interface that all expressions must implement.
            - it has interpret() method that takes a Context object as input and returns an integer.
        ** NumberExpression: A terminal expression that implements the Expression interface
            - it has an integer field called number storing a terminal value
            - it has a constructor that initializes the number field through instantiation
            - it interprets itself without relying on other expressions and it directly return an integer stored in
              the number field
        ** AddExpression, SubtractExpression, MultiplyExpression, DivideExpression: they are all non-terminal
           expression and they all implement the Expression interface.
            - they all have two Expression fields one to store the left operand of an arithmetic operation and one
              for the right operand
            - they all have a constructor that initializes both fields through instantiation
            - they all interpret themselves by interpreting the two operand Expression field objects
        ** Context: an empty context class that is there just in case you want to store context specific information
           for interpretation. but in our example we don't need it but we left it nonetheless just to show that it
           is an important part of the pattern in general
        ** InterpreterPatternDemo: client code
            - we create a context object
            - we create an expression object that is basically layers of wrapped terminal and non terminal expressions
            - we called the interpret method on the expression object and passed the context object as argument

    # In Conclusion:
        ** this design pattern is used for creating grammar for a language and providing means to interpret any
           expression written in that language syntax.
        ** this pattern allows you to write complex expression by layering them in the client code
        ** and this is why this pattern is quite dynamic and flexible
        ** it also follows the single responsibility principle since every expression does only one sort of operation
        ** it is loosely coupled in the sense that every expression doesn't know about other expressions
        ** it also follows the open/closed principle since you can always add new expression without breaking
           existing code