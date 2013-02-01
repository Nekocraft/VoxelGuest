package com.thevoxelbox.voxelguest.modules.asshat.ban;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Monofraps
 */
@Entity
@Table(name = "bans")
public class BannedPlayer
{
	@Id
	@GeneratedValue
	@Column
	private long id;
	@Column
	private String playerName;
	@Column
	private String banReason;

	public BannedPlayer(final String playerName, final String banReason)
	{

		this.playerName = playerName;
		this.banReason = banReason;
	}

	public final String getPlayerName()
	{
		return playerName;
	}

	public final void setPlayerName(final String playerName)
	{
		this.playerName = playerName;
	}

	public final String getBanReason()
	{
		return banReason;
	}

	public final void setBanReason(final String banReason)
	{
		this.banReason = banReason;
	}
}
