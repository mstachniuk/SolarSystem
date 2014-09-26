package com.blogspot.mstachniuk.solarsystem;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
public class Assertions {

  /**
   * Creates a new instance of <code>{@link com.blogspot.mstachniuk.solarsystem.PlanetAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
  public static com.blogspot.mstachniuk.solarsystem.PlanetAssert assertThat(com.blogspot.mstachniuk.solarsystem.Planet actual) {
    return new com.blogspot.mstachniuk.solarsystem.PlanetAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
