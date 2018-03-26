package org.elsys.gates;

public abstract class NandFactory {

	
	public static Gate makeNotGate(Wire in, Wire out, String name) {
		NandGate nand = new NandGate(in, in, out);
		return nand;
	}

	public static Gate makeNotGate(Wire in, Wire out) {
		return makeNotGate(in, out, "NandNot");
	}

	public static Gate makeAndGate(Wire in1, Wire in2, Wire out, String name) {
		Wire out1 = new Wire("out1");
		NandGate andf = new NandGate(in1, in2, out1);
		NandGate ands = new NandGate(out1, out1, out);
		CompositeGate gate = new CompositeGate("And");
		gate.addGate(andf);
		gate.addGate(ands);
		return gate;
	}

	public static Gate makeAndGate(Wire in1, Wire in2, Wire out) {
		return makeAndGate(in1, in2, out, "NandAnd");
	}

	public static Gate makeOrGate(Wire in1, Wire in2, Wire out, String name) {
		return null;
	}

	public static Gate makeOrGate(Wire in1, Wire in2, Wire out) {
		return makeOrGate(in1, in2, out, "NandOr");
	}

	public static Gate makeXorGate(Wire in1, Wire in2, Wire out, String name) {
		return null;
	}

	public static Gate makeXorGate(Wire in1, Wire in2, Wire out) {
		return makeXorGate(in1, in2, out, "NandXor");
	}

}
