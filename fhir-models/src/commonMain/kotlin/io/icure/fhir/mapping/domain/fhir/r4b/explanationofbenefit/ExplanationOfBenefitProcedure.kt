//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Clinical procedures performed
 *
 * Procedures performed on the patient relevant to the billing items with the claim.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Procedure instance identifier
 * @param date When the procedure was performed
 * @param procedureCodeableConcept Specific clinical procedure
 * @param procedureReference Specific clinical procedure
 */
@SerialName("ExplanationOfBenefitProcedure")
@Serializable
public data class ExplanationOfBenefitProcedure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Procedure instance identifier
   */
  public val sequence: Int? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * When the procedure was performed
   */
  public val date: String? = null,
  /**
   * Specific clinical procedure
   */
  public val procedureCodeableConcept: CodeableConcept? = null,
  /**
   * Specific clinical procedure
   */
  public val procedureReference: Reference? = null,
  public val udi: List<Reference> = emptyList(),
) : BackboneElement
