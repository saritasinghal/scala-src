package com.inbravo.spark

import java.util.Arrays;
import org.apache.spark.{ SparkContext, SparkConf }

/**
 * amit.dixit
 */
object SparkKeyValueEx {

  def main(args: Array[String]) {

    /* Spark context for java */
    var sc = new SparkContext(new SparkConf().setAppName("SparkKeyValueEx").setMaster("local"));

    /* Create RDDs of integer array */
    var rddOne = sc.parallelize(Array(1, 2, 3, 3, 4));
    var rddTwo = sc.parallelize(Array(3, 4, 4, 5, 6));

    println("=========================================================================================================");
    println("---------Various Trans/actions on RDD " + rddOne.collect() + "} & RDD {" + rddTwo.collect() + "}---------");

    /* Collect all elements */
    println("-------Collect : " + rddOne.collect());

    /* Show union */
    println("---------Union : " + rddOne.union(rddTwo).collect());

    /* Show intersection */
    println("--Intersection : " + rddOne.intersection(rddTwo).collect());

    /* Apply subtract */
    println("------Subtract : " + rddOne.subtract(rddTwo).collect());

    /* Apply cartesian */
    println("-----Cartesian : " + rddOne.cartesian(rddTwo).collect());

    /* Count all elements in RDDs */
    println("---------Count : " + (rddOne.count() + rddTwo.count()));

    /* Count all element values */
    println("--CountByValue : " + rddOne.countByValue());

    /* Get third element */
    println("----------Take : " + rddOne.take(3));

    /* Get only values which are less than 3 */
    println("--------Filter : " + rddOne.filter(x => x < 3).collect());

    /* Show Reduce result */
    println("--------Reduce : " + rddOne.union(rddTwo).reduce((x, y) => Math.max(x, y)));

    /* Show Map result */
    println("-----------Map : " + rddOne.map(x => x * x).collect());

    /* FlatMap returns java.lang.Iterable */
    println("-------FlatMap : " + rddOne.flatMap(x => Array(x * x)).collect());

    println("=========================================================================================================");

    /* stop spark context */
    sc.stop();
  }
}