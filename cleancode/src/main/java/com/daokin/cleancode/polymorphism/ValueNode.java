package com.daokin.cleancode.polymorphism;

public class ValueNode extends Node {
	double value;

	@Override
	double evaluate() {
		return value;
	}

}
