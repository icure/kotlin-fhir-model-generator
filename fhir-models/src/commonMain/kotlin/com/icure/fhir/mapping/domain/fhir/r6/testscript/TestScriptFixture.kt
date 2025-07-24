//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testscript

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Fixture in the test script - by reference (uri)
 *
 * Fixture in the test script - by reference (uri). All fixtures are required for the test script to
 * execute.
 *
 * @param id Unique id for inter-element referencing
 * @param autocreate Whether or not to implicitly create the fixture during setup
 * @param autodelete Whether or not to implicitly delete the fixture during teardown
 * @param resource Reference of the resource
 */
@SerialName("TestScriptFixture")
@Serializable
public data class TestScriptFixture(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether or not to implicitly create the fixture during setup
   */
  public val autocreate: Boolean? = null,
  /**
   * Whether or not to implicitly delete the fixture during teardown
   */
  public val autodelete: Boolean? = null,
  /**
   * Reference of the resource
   */
  public val resource: Reference? = null,
) : BackboneElement
