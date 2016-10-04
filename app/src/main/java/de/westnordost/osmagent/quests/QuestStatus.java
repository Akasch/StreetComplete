package de.westnordost.osmagent.quests;

public enum QuestStatus
{
	/** just created */
	NEW,
	/** user answered the question (waiting for changes to be uploaded) */
	ANSWERED,
	/** user chose to hide the quest */
	HIDDEN;

	public boolean isVisible()
	{
		return this == NEW;
	}
}
