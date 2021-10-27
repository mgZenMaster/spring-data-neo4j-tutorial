CREATE (animals:Release {name:"Animals", year: 1977})
CREATE (:Song{name:"Pigs on the wing 1", length: localtime("1:25")})-[:APPEARS_ON {song_nr: 1}]->(animals)
CREATE (:Song{name:"Dogs", length: localtime("17:04")})-[:APPEARS_ON {song_nr: 2}]->(animals)
CREATE (:Song{name:"Pigs (Three Different Ones)", length: localtime("11:22")})-[:APPEARS_ON {song_nr: 3}]->(animals)
CREATE (:Song{name: "Sheep", length: localtime("10:24")})-[:APPEARS_ON {song_nr: 4}]->(animals)
CREATE (:Song{name: "Pigs on the wing 2", length: localtime("1:25")})-[:APPEARS_ON {song_nr: 5}]->(animals);

CREATE (s:Song {name:"I", length: localtime("21:04")})-[a:APPEARS_ON {song_nr: 1}]->(r:Release {name:"I", year: 2004});

CREATE (r:Release {name: "Heartwork", year: 1993})
CREATE (:Song {name: "Buried Dreams", length: localtime("3:59")})-[:APPEARS_ON {song_nr: 1}]->(r)
CREATE (:Song {name: "Carnal Forge", length: localtime("3:54")})-[:APPEARS_ON {song_nr: 2}]->(r)
CREATE (:Song {name: "No Love Lost", length: localtime("3:22")})-[:APPEARS_ON {song_nr: 3}]->(r)
CREATE (:Song {name: "Heartwork", length: localtime("4:33")})-[:APPEARS_ON {song_nr: 4}]->(r)
CREATE (:Song {name: "Embodiement", length: localtime("5:37")})-[:APPEARS_ON {song_nr: 5}]->(r)
CREATE (:Song {name: "This Mortal Coil", length: localtime("3:49")})-[:APPEARS_ON {song_nr: 6}]->(r)
CREATE (:Song {name: "Arbeit Macht Fleisch", length: localtime("4:21")})-[:APPEARS_ON {song_nr: 7}]->(r)
CREATE (:Song {name: "Blind Bleeding The Blind", length: localtime("4:57")})-[:APPEARS_ON {song_nr: 8}]->(r)
CREATE (:Song {name: "Doctrinal Expletives", length: localtime("3:39")})-[:APPEARS_ON {song_nr: 9}]->(r)
CREATE (:Song {name: "Death Certificate", length: localtime("3:38")})-[:APPEARS_ON {song_nr: 10}]->(r);

MATCH(heartwork:Song {name: "Heartwork"})
CREATE(heartwork)-[:APPEARS_ON {song_nr: 1}]->(r:Release {name: "Heartwork EP", year: 1993})
CREATE(:Song {name: "This Is Your Life", length: localtime("4:05")})-[:APPEARS_ON {song_nr: 2}]->(r)
CREATE(:Song {name: "Rot 'n' Roll", length: localtime("3:49")})-[:APPEARS_ON {song_nr: 3}]->(r)
CREATE(:Song {name: "Tools Of The Trade", length: localtime("3:07")})-[:APPEARS_ON {song_nr: 4}]->(r)
CREATE(:Song {name: "Pyosified - Still Rotten To The Gore", length: localtime("3:10")})-[:APPEARS_ON {song_nr: 5}]->(r)
CREATE(:Song {name: "Hepatic Tissue Fermentation II", length: localtime("6:37")})-[:APPEARS_ON {song_nr: 6}]->(r);
