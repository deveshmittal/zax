package com.inovex.zabbixmobile.listeners;

import com.inovex.zabbixmobile.model.Item;

// Container Activity must implement this interface
public interface OnChecksItemSelectedListener {

	/**
	 * Callback method for the selection of a host.
	 * 
	 * @param position
	 *            list position
	 * @param id
	 *            event ID (Zabbix event_id)
	 */
	public void onHostSelected(int position, long id);

	/**
	 * Callback method for the selection of an application.
	 * 
	 * @param position
	 *            list position
	 */
	public void onApplicationSelected(int position);

	/**
	 * Callback method for the selection of an item.
	 * 
	 * @param position
	 *            list position
	 * @param item
	 *            the selected item
	 * @param showItemDetails
	 *            whether or not the item details shall be shown (at activity
	 *            startup, the details shall not be shown)
	 */
	public void onItemSelected(int position, Item item, boolean showItemDetails);

}