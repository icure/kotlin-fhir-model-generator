//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What defines the members of the evidence element
 *
 * A characteristic that defines the members of the evidence element. Multiple characteristics are
 * applied with "and" semantics.
 *
 * @param id Unique id for inter-element referencing
 * @param description Natural language description of the characteristic
 * @param definitionReference What code or expression defines members?
 * @param definitionCanonical What code or expression defines members?
 * @param definitionCodeableConcept What code or expression defines members?
 * @param definitionExpression What code or expression defines members?
 * @param method Method used for describing characteristic
 * @param device Device used for determining characteristic
 * @param exclude Whether the characteristic includes or excludes members
 * @param timeFromStart Observation time from study start
 * @param groupMeasure mean | median | mean-of-mean | mean-of-median | median-of-mean |
 * median-of-median
 */
@SerialName("EvidenceVariableCharacteristic")
@Serializable
public data class EvidenceVariableCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Natural language description of the characteristic
   */
  public val description: String? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionReference: Reference? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionCanonical: String? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionCodeableConcept: CodeableConcept? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionExpression: Expression? = null,
  /**
   * Method used for describing characteristic
   */
  public val method: CodeableConcept? = null,
  /**
   * Device used for determining characteristic
   */
  public val device: Reference? = null,
  /**
   * Whether the characteristic includes or excludes members
   */
  public val exclude: Boolean? = null,
  /**
   * Observation time from study start
   */
  public val timeFromStart: EvidenceVariableCharacteristicTimeFromStart? = null,
  /**
   * mean | median | mean-of-mean | mean-of-median | median-of-mean | median-of-median
   */
  public val groupMeasure: String? = null,
) : BackboneElement
