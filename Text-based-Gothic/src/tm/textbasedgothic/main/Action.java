class Actions {
	public enum Action () {
		SLEEP, EXIT_TO, TALK_TO, ATTACK;
	}
	
	public void takeAction(Action action) {				// should that be a player method?
		switch (action) {
			case SLEEP:
				sleep(player);
				break;
			case EXIT_TO:
				exitTo(player, locationId);
				break;
			case TALK_TO:
				talkTo(player, npcId);
				break;
			case ATTACK:
				attack(player, monsterId);
				break;
			default:
				// something
		}


}
