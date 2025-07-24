//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Plan details
 *
 * Details about an insurance plan.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of plan
 */
@SerialName("InsurancePlanPlan")
@Serializable
public data class InsurancePlanPlan(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Type of plan
   */
  public val type: CodeableConcept? = null,
  public val coverageArea: List<Reference> = emptyList(),
  public val network: List<Reference> = emptyList(),
  public val generalCost: List<InsurancePlanPlanGeneralCost> = emptyList(),
  public val specificCost: List<InsurancePlanPlanSpecificCost> = emptyList(),
) : BackboneElement
