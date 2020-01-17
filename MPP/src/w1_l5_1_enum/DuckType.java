package w1_l5_1_enum;


public enum DuckType implements FlyBehavior,QuackBehavior {
	
	MALLARD {

		@Override
		public String fly() {
			 return "fly with wings";
		}

		@Override
		public String quack() {
			return "quacking";
		}
		
	},

	DECOY {
		
		@Override
		public String fly() {
			return "cannot fly";
		}

		@Override
		public String quack() {
			return "cannot quack";
		}},
	
	REDHEAD {

		@Override
		public String fly() {
			return "fly with wings";
		}

		@Override
		public String quack() {
			return "quacking";
		}
		
	},
	RUBBER {

		@Override
		public String fly() {
			return "cannot fly";
		}

		@Override
		public String quack() {
			return "squeaking";
		}
		
	}
	
}
