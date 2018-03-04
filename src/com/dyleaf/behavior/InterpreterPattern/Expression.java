package com.dyleaf.behavior.InterpreterPattern;

import java.util.Map;

/**
 *抽象的解释操作父类
 */
public interface Expression {
    public int interpret(Map<String, Expression> variables);
}

/**
 * 数字解释器
 */
class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}

/**
 * 加法解释器
 */
class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}

/**
 * 减法解释器
 */
class Minus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Minus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}

/**
 * 变量解释器
 */
class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Map<String, Expression> variables) {
        if (null == variables.get(name))
            return 0; // Either return new Evaluator(0).
        return variables.get(name).interpret(variables);
    }
}