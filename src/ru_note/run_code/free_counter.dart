import 'package:flutter/material.dart';

class Freecounter extends StatefulWidget {
  const Freecounter({Key? key}) : super(key: key);

  @override
  _FreecounterState createState() => _FreecounterState();
}

class _FreecounterState extends State<Freecounter> {
int count =0;
void incrementcount(){
  setState(() {
    count++;
  });
}
void decrementcount(){
  count--;

}
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children:[

           Text("Counter Value is : $count"),
            const SizedBox(
              height: 10,
            ),
            FloatingActionButton(
              onPressed: incrementcount,

              child: const Text('+'),
            ),
            FloatingActionButton(
              onPressed: decrementcount,

              child: const Text('-'),
            ),
          ],
        ),
      ),
    );
  }
}
