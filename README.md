# Simplest Talks Listing Service

This is a talks listing service that works of JSON files in the `/talks` directory. 

There is a site that lets you browse talks

There will be a script, to be run by a GitHub Action or other triggered task, to regenerate .ics files for each talks series so these can update too.

## Format of talks

For most people, these are the only files you need to think about:

* In `talks/lists.json`, you configure which other json files should be read. Each entry is the name of a talk series. 
  Usually, you'll only need to edit this when adding a new series or archiving off old talks. It is intended to be simple enough to edit from GitHub / GitLab's in-built editor.
* In lists, e.g. `talks/srs.json` you list the talks in a series.
  To advertise a new talk, add another JSON object to the array. It is intended to be simple enough to edit from GitHub / GitLab's in-built editor

## The web client

The code for the web client is also in this repository. If you don't know Scala, ignore it.

## ICS-ifier

The code for an "icsifier" that will produce a .ics file for each talks series is also in this repository. If you don't know Scala, ignore it. 