//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.testreport

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The results of running the series of required clean up steps
 *
 * The results of the series of operations required to clean up after all the tests were executed
 * (successfully or otherwise).
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("TestReportTeardown")
@Serializable
public data class TestReportTeardown(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val action: List<TestReportTeardownAction> = emptyList(),
) : BackboneElement
