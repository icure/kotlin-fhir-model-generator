//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testscript

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indication of the artifact(s) that are tested by this test case
 *
 * The scope indicates a conformance artifact that is tested by the test(s) within this test case
 * and the expectation of the test outcome(s) as well as the intended test phase inclusion.
 *
 * @param id Unique id for inter-element referencing
 * @param artifact The specific conformance artifact being tested
 * @param conformance required | optional | strict
 * @param phase unit | integration | production
 */
@SerialName("TestScriptScope")
@Serializable
public data class TestScriptScope(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The specific conformance artifact being tested
   */
  public val artifact: String? = null,
  /**
   * required | optional | strict
   */
  public val conformance: CodeableConcept? = null,
  /**
   * unit | integration | production
   */
  public val phase: CodeableConcept? = null,
) : BackboneElement
