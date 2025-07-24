//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.claim

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
@SerialName("ClaimProcedure")
@Serializable
public data class ClaimProcedure(
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
